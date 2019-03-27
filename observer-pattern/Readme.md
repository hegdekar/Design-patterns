# Observer Pattern

## Concept

In this pattern, there are multiple *observers* which are observing a particular *subject*.
Observers are interested and want to be notified about a change in Subject. So observers register
themselves to be notified of change whenever there is one, and un-register when they are no longer
interested. This is also referred as *Publisher-Subscriber* Model at times.

## Example

A simple UI which is connected to some database(or business logic) will alter the data as per user's interaction.
In other case if the backing database has a change, UI needs to be notified about it so that it can change and display
the current value.