.class public abstract Lv3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Lv3/q;
    .locals 1

    new-instance p0, Lv3/o;

    invoke-direct {p0}, Lv3/o;-><init>()V

    const-string v0, "common"

    .line 1
    invoke-virtual {p0, v0}, Lv3/o;->d(Ljava/lang/String;)Lv3/q;

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lv3/q;->a(Z)Lv3/q;

    .line 3
    invoke-virtual {p0, v0}, Lv3/q;->b(I)Lv3/q;

    return-object p0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
