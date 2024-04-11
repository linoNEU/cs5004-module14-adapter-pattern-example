# CS 5004 Object-Oriented Design, Module 14 - Adapter Pattern

This repository contains a small project that illustrates the use of the Adapter Pattern in Java. The project is part of the CS 5004 Object-Oriented Design course.

## Project Overview

The project demonstrates how to adapt a legacy system to a new system without changing the original source code of the legacy system. In this case, we have a `LegacyUser` class that represents users in the old system, and a new `UserInterface` that the new system uses.

The `LegacyUser` class has a different method structure compared to the `UserInterface`. To make the `LegacyUser` compatible with the new system, we use the Adapter Pattern. We create a `UserAdapter` class that implements the `UserInterface` and uses an instance of the `LegacyUser` to provide the necessary data.

## Code Structure

- `src/adapter/LegacyUser.java`: This file contains the `LegacyUser` class, which represents a user in the old system.
- `src/adapter/UserAdapter.java`: This file contains the `UserAdapter` class, which implements the `UserInterface` and adapts a `LegacyUser` to the new system.
- `test/UserAdapterTest.java`: This file contains the `UserAdapterTest` class, which includes unit tests for the `UserAdapter` class.

## Learning Outcomes

By studying this project, you will understand:

- How the Adapter Pattern works.
- How to use the Adapter Pattern to make a legacy system compatible with a new system.
- How to write unit tests for the Adapter Pattern.
