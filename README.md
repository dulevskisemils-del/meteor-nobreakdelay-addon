# NoBreakDelay Addon for Meteor Client 1.21.11

A configurable client-side break-delay module for Meteor Client.

## Features

- Adjustable break delay (0.01 - 10.00 seconds)
- Toggle to only apply while mining
- Easy configuration through Meteor's settings system

## Settings

- **break-delay**: The delay value to apply (default: 0.35s)
- **only-while-mining**: Only active while holding the attack key (default: true)

## Building

```bash
./gradlew build
```

The compiled addon JAR will be in `build/libs/`.

## Installation

1. Build the addon using `./gradlew build`
2. Copy the JAR file from `build/libs/` to your Meteor Client addons folder
3. Restart Meteor Client
4. Enable the module in-game

## Requirements

- Meteor Client 1.21.11+
- Java 17+
