#!/bin/bash
# Lab 1 - Task 1: create the file tree

cd ~ || exit

mkdir -p lab0/grotle2 lab0/huntail8/mightyena lab0/huntail8/wingull lab0/scyther9

echo "Тип диеты
Herbivore" > lab0/azurill5

echo "Тип диеты
Carnivore" > lab0/gabite0

echo "Способности  Acid Spray Double Team Quick Attack
Struggle Bug Mega Drain Swift Me First Agility Giga Drain U-turn Bug Buzz Recover Power Swap Final Gambit" > lab0/grotle2/accelgor

echo "Возможности  Overland=6
Surface=4 Burrow=6 Jump=2 Power=3 Intelligence=4
Stealth=0" > lab0/grotle2/sandile

touch lab0/grotle2/cloyster

echo "Ходы  Covet Dive Icy Wind Mud-Slap Signal Beam Sleep
Talk Snore Stealth Rock Water Pledge Water Pulse" > lab0/huntail8/piplup

echo "Способности
Last Chance Vital Spirit Pickup" > lab0/huntail8/lillipup

echo "Тип покемона  ELECTRIC
NONE" > lab0/mareep8

echo "Живет  Desert" > lab0/scyther9/cofagrigus

echo "Способности  Swarm Venom Shield
Dust Effect Spore" > lab0/scyther9/dustox

echo "Способности  Rapid Spin Mud-Slap Rock Tomb
Psybeam Power Trick Ancientpower Selfdestruct Extrasensory Cosmic Power Guard Split Power Split Hyper Beam Earth Power Sandstorm Heal Block Explosion" > lab0/scyther9/claydol

# check the tree
find lab0
pwd
