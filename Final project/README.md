# Game Engine

A small console game engine built as a final project for the Design Patterns course. You create a character, give it a combat style and a way to be displayed, then let two characters fight until one of them dies. The game itself is simple on purpose. The point is to show six design patterns working together in one codebase.

## Patterns used

**Abstract Factory** (`abstract_factory/`)
Each character class has its own factory that produces a matching set of objects: the character, a weapon and an armor. So a warrior always gets a sword and heavy armor, a mage gets a staff and a robe, and so on. Nobody can accidentally give a mage a sword.

**Builder** (`builders/`)
`CharacterBuilder` assembles a character step by step: name, weapon, armor. `CharacterDirector` holds ready-made recipes. There are two concrete builders that build from the same steps but give different results: `CharacterObjectBuilder` returns a real `GameCharacter`, while `CharacterJsonBuilder` returns a JSON string describing it. Builders get their parts from an Abstract Factory, which is where the two patterns meet.

**Strategy** (`strategy/`)
How a character decides what to do on its turn is a swappable `CombatStrategy`. We have `AggressiveStrategy`, `BalancedStrategy` and `DefensiveStrategy`, and a character can switch between them at any moment, even in the middle of a fight.

**Observer** (`observer/`)
Characters notify listeners about what happens to them: damage taken, death, a missed attack, a defense. `ConsoleLogListener` prints these events as they happen, and `StatsListener` quietly counts them. Characters don't know or care who is listening, and you can attach a listener to just one character if you only want its stats.

**Bridge** (`bridge/`)
A character's `display()` only describes what to show. How it looks is up to a `Renderer`: `ConsoleRenderer` prints plain text, `AsciiRenderer` draws an ASCII bar. Character types and rendering styles vary independently, so adding a new renderer doesn't touch the characters at all.

**Facade** (`GameFacade.java`)
Putting all of the above together by hand is tedious: pick a factory, run a builder through a director, set a strategy and renderer, attach listeners. `GameFacade` hides this behind `createCharacter(type, name, strategy, renderer)`. It also runs the whole fight loop with `fight()` and prints the combined stats with `printStats()`.

## How they fit together

`GameFacade` is the entry point. It picks the right Abstract Factory, passes it to a Builder, and the Builder asks the factory for parts. The finished character gets a Strategy, a Renderer (Bridge) and some Observers attached. During a fight the Strategy decides each move and the Observers react to the results.

`Main.java` runs a demo of every pattern in order.