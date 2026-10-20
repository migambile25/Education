
#!/bin/bash
# Lab 1

cd ~
### Task 1: create the file tree

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


### Task 2: set permissions with chmod

chmod 640 lab0/azurill5
chmod 002 lab0/gabite0
chmod 576 lab0/grotle2
chmod 307 lab0/grotle2/cloyster
chmod 622 lab0/grotle2/accelgor
chmod 006 lab0/grotle2/sandile
chmod 711 lab0/huntail8
chmod 444 lab0/huntail8/piplup
chmod 752 lab0/huntail8/mightyena
chmod 006 lab0/huntail8/lillipup
chmod 524 lab0/huntail8/wingull
chmod 062 lab0/mareep8
chmod 571 lab0/scyther9
chmod 062 lab0/scyther9/cofagrigus
chmod 600 lab0/scyther9/dustox
chmod 600 lab0/scyther9/claydol

# verify permissions
ls -lR lab0


### Task 3: copying and links

# copy the content of mareep8
cat lab0/mareep8 > lab0/huntail8/lillipupmareep

# copy the file mareep8 into lab0/grotle2/cloyster
cp lab0/mareep8 lab0/grotle2/cloyster

# merge scyther9/cofagrigus and grotle2/accelgor file lab0/mareep8_68
cat lab0/scyther9/cofagrigus lab0/grotle2/accelgor > lab0/mareep8_68

# hard link to mareep8
ln lab0/mareep8 lab0/grotle2/accelgormareep

# symbolic link to azurill5
ln -s "$(pwd)/lab0/azurill5" lab0/scyther9/claydolazurill

# recursively copy huntail8 into huntail8/mightyena
cp -r lab0/huntail8 lab0/huntail8/mightyena #bound to fail

# symbolic link to the scyther9 directory
ln -s scyther9 lab0/Copy_64

# verify
ls -l lab0 lab0/grotle2 lab0/huntail8 lab0/scyther9


### Task 4: search and filtering

# a) recursively count characters in files ending in '8', sort ascending, merge errors into stdout
find lab0 -type f -name '*8' -exec wc -c {} + 2>&1 | sort -n

# b) list filenames in huntail8, sort z->a, redirect errors to a file in /tmp
ls -r lab0/huntail8 2> /tmp/task4b_errors.log

# c) show content of files with line numbers, exclude lines containing "ve", errors to a file in /tmp
cat -n lab0/huntail8/piplup lab0/huntail8/lillipup lab0/scyther9/cofagrigus 2> /tmp/task4c_errors.log | grep -v 've'

# d) show content of files, exclude lines ending in 'e' (case-insensitive), merge errors into stdout
cat lab0/grotle2/sandile lab0/huntail8/piplup lab0/huntail8/lillipup lab0/scyther9/cofagrigus 2>&1 | grep -vi 'e$'

# e) count lines in accelgor, sandile, sort descending, suppress errors
wc -l lab0/grotle2/accelgor lab0/grotle2/sandile 2>/dev/null | sort -rn

# f) first 2 entries of a recursive long-listing of files ending in 'l', sorted ascending by hard-link count, errors neither suppressed nor redirected
find lab0 -type f -name '*l' -exec ls -l {} + | sort -k2,2n | head -n 2


### Task 5: deletion

rm lab0/azurill5
rm lab0/scyther9/dustox
rm lab0/scyther9/claydolazuri*
rm lab0/grotle2/accelgormare*
rm -r lab0/scyther9
rm lab0/grotle2/cloyster

# final check
find lab0
