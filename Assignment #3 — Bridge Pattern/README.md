# Assignment #3 — Bridge

Shape–Renderer demo: shapes can be drawn by interchangeable renderers, with
the two sides built as separate hierarchies connected by composition instead
of inheritance.

## Bridge

`Shape` is the Abstraction (`Circle`, `Square` are Refined Abstractions),
`Renderer` is the Implementor (`VectorRenderer`, `RasterRenderer` are
Concrete Implementors). Each `Shape` holds a reference to a `Renderer` and
delegates drawing to it, so any shape can be paired with any renderer at
runtime.
