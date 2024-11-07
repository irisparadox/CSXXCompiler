# ç++ Compiler

This project implements a **compiler** for a programming language called **ç++**. The language is a **C++-like** language, but with all its syntax and keywords written in **Catalan**. The goal of this project is to demonstrate the use of **JFLex** and **CUP** to create a lexical and syntactic analyzer for this custom language.

## Introduction

ç++ is a new programming language designed to resemble C++, but with a twist: all the keywords, syntax, and error messages are written in **Catalan**. This includes basic programming structures such as loops, conditionals, and data types.

This project leverages **JFLex** for the lexical analysis (tokenization) and **CUP** for the syntax analysis (parsing). The compiler is designed to read **ç++** source code, tokenize it, parse it according to the grammar of the language, and produce an abstract syntax tree (AST) or an error message if the code is invalid.

## Features

- Lexical analysis using **JFLex**.
- Syntax analysis using **CUP**.
- Error detection and reporting in **Catalan**.
- Support for basic programming constructs such as loops, conditions, and variables.
- A simple interpreter or code generator (depending on future extensions).