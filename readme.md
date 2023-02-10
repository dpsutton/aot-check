AOT check

```shell

> clj -T:build build/uber

❯ tree target
target
├── classes
│   ├── dep$do_stuff.class
│   ├── dep$fn__142.class
│   ├── dep$fn__144.class
│   ├── dep$loading__6789__auto____140.class
│   ├── dep.clj
│   ├── dep__init.class
│   ├── entry$_main.class
│   ├── entry$fn__149.class
│   ├── entry$loading__6789__auto____147.class
│   ├── entry.class
│   ├── entry.clj
│   └── entry__init.class
└── lib1-1.2.0-standalone.jar

❯ java -jar target/lib1-1.2.0-standalone.jar
hi you've arrived

```

Decompiling the classes can be done with this [Bytecode viewer](https://github.com/konloch/bytecode-viewer/releases)

and then running `java -jar Bytecode-Viewer-2.11.2.jar`

![decompiled view](decompiled.jpb "Decompiled Classes")
