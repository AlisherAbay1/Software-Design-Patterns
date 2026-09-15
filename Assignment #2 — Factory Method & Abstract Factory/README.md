# Assignment #2 — Factory Method & Abstract Factory
This assignment has two small demos, one for each pattern. I picked the transport example for Factory Method and made up my own theme for Abstract Factory, a tiny fantasy fight between an Elf and an Orc, just because a plain GUI toolkit example felt kind of boring to build.

## Part A - Factory Method (`fabric_method/`)

Transport delivery example: `Transport` is the Product (`Truck`, `Ship` are
Concrete Products), `TransportFactory` is the Creator (`TruckFactory`,
`ShipFactory` are Concrete Creators).

## Part B - Abstract Factory (`abstract_factory/`)

Elf vs Orc fight: `RaceFactory` is the Abstract Factory, `ElfFactory` /
`OrcFactory` each build a matching set of `Warrior` + `Weapon` + `Armor`.
