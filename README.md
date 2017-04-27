# Stack Test.

The method that has bugged is represented in TRUE.

There are 2 stacks type created by StackFactory.
StackFactory.SetStackType(0) is Type I.
StackFactory.SetStackType(1) is Type II, of course.

|Method|Type I | Type II|
|:-----:|:-------:|:--------:|
|POP|-|-|
|PEEK|-|TRUE|
|PUSH|TRUET|TRUE|
|isEmpty|-|-|
|isFull|-|TRUE|
|capacity|-|-|
|size|-|TRUE|

# Here are the lists that I tested.

## POP
- basic POP.
- test pop Empty stack.

## PEEK
- peek when stack has nothing.
- peek after push.

## PUSH
- push Null.
- push over the stack size.

## ISEMPTY
- Empty when create.
- Empty when push and pop.
- Empty when create zero capacity.

## ISFULL
- Is full when stack is full.
- Is full when size is equal zero.

## CAPACITY
- get the right capacity.

## SIZE
- get the correct size.
- get the correct size after push and pop over again.

<code> Author : Thitiwat Thongbor </code>
