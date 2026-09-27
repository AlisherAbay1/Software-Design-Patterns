# Assignment #6 — Visitor

File system demo: a client builds a tree of files and directories, then runs two unrelated operations, total size and search by name pattern, over that same tree without touching the `File`/`Directory` classes at all.

## Visitor

`FileSystemElement` is the Element interface with one method, `accept(FileSystemVisitor)`. `File` and `Directory` are the Concrete Elements; each implements `accept()` by calling the matching `visitX()` on the visitor and passing itself that's the double dispatch.

`FileSystemVisitor` declares `visitFile()` and `visitDirectory()`. `SizeCalculatorVisitor` sums up file bytes, `SearchVisitor` collects files matching a name pattern; both rely on `Directory.visitDirectory()` walking its children via `child.accept(this)` to recurse.

No `instanceof` anywhere, the right `visitX()` is picked automatically. `Main` builds a small tree and runs both visitors over the same `root`, printing total size and matched files.