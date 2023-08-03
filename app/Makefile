.DEFAULT_GOAL := build-run

run-dist:
	./build/install/app/bin/app

clean:
	gradle clean

build:
	gradle clean
	gradle build

build-run:
	gradle clean
	gradle installDist
	./build/install/app/bin/app

.PHONY: build