.class public Lu/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lr/z;)I
    .locals 1

    .line 1
    const-class v0, Lt/v;

    .line 2
    invoke-static {v0}, Lt/l;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    check-cast v0, Lt/v;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lt/v;->a()I

    move-result p1

    return p1

    .line 4
    :cond_0
    invoke-static {p1, p2}, Lt/g;->a(Ljava/lang/String;Lr/z;)Lw/y1;

    move-result-object p1

    const-class p2, Lt/c;

    .line 5
    invoke-virtual {p1, p2}, Lw/y1;->b(Ljava/lang/Class;)Lw/x1;

    move-result-object p1

    check-cast p1, Lt/c;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lt/c;->a()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x3

    return p1
.end method
