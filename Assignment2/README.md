Problems in the first Design:
1- the Player and Monster classes Depends on concrete class (Entity), which makes it hard to make any changes, also the Player class have access for
MakeNoise Method, meanwhile This function is only valid for monsters.



2- Same thing for MonsterStealth, MonsterFast, both of them depends on concrete class, it will be hard to make changes, add new attributes-Types for monsters,
and we can't add a monster that can have more than attribute-Type , and it won't be easy to add new types of Monsters.

----------------------------------------------------------------------------------------------------------
                                               ##Solution##
----------------------------------------------------------------------------------------------------------


1- For the first problem, i make Entity an abstract class, so the Player and Monster no longer depends on concrete class,the MakeNoise Method now is only availabe for
monsters.



2- For the secound problem, i created a new abstract class that extends from Monster, this class to make as many as types of monsters i want in an easy way, and without
too much change in the code, and then we can add these types to the monster and the monster can be two types at the same time(not sure if this was a requirement).
