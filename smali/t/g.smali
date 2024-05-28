.class public Lt/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Lr/z;)Lw/y1;
    .locals 1

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-static {p1}, Lt/a;->c(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lt/a;

    invoke-direct {v0, p1}, Lt/a;-><init>(Lr/z;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    :cond_0
    invoke-static {p1}, Lt/c;->b(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    new-instance v0, Lt/c;

    invoke-direct {v0}, Lt/c;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_1
    invoke-static {p1}, Lt/u;->a(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    new-instance v0, Lt/u;

    invoke-direct {v0}, Lt/u;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_2
    invoke-static {p1}, Lt/e;->b(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    new-instance v0, Lt/e;

    invoke-direct {v0, p1}, Lt/e;-><init>(Lr/z;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    :cond_3
    invoke-static {p1}, Lt/t;->a(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    new-instance v0, Lt/t;

    invoke-direct {v0}, Lt/t;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    :cond_4
    invoke-static {p1}, Lt/f;->a(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    new-instance v0, Lt/f;

    invoke-direct {v0}, Lt/f;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_5
    invoke-static {p1}, Lt/c0;->d(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15
    new-instance v0, Lt/c0;

    invoke-direct {v0}, Lt/c0;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_6
    invoke-static {p1}, Lt/r;->a(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 17
    new-instance v0, Lt/r;

    invoke-direct {v0}, Lt/r;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    :cond_7
    invoke-static {p1}, Lt/b;->a(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 19
    new-instance v0, Lt/b;

    invoke-direct {v0}, Lt/b;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    :cond_8
    invoke-static {p1}, Lt/j;->a(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 21
    new-instance v0, Lt/j;

    invoke-direct {v0}, Lt/j;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_9
    invoke-static {p1}, Lt/w;->a(Lr/z;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 23
    new-instance v0, Lt/w;

    invoke-direct {v0}, Lt/w;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    :cond_a
    invoke-static {p1}, Lt/i;->a(Lr/z;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 25
    new-instance p1, Lt/i;

    invoke-direct {p1}, Lt/i;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_b
    new-instance p1, Lw/y1;

    invoke-direct {p1, p0}, Lw/y1;-><init>(Ljava/util/List;)V

    return-object p1
.end method
