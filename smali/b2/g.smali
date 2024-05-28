.class public abstract Lb2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb2/g;
    .locals 4

    new-instance v0, Lb2/b;

    sget-object v1, Lb2/g$a;->p:Lb2/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lb2/b;-><init>(Lb2/g$a;J)V

    return-object v0
.end method

.method public static d()Lb2/g;
    .locals 4

    new-instance v0, Lb2/b;

    sget-object v1, Lb2/g$a;->q:Lb2/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lb2/b;-><init>(Lb2/g$a;J)V

    return-object v0
.end method

.method public static e(J)Lb2/g;
    .locals 2

    new-instance v0, Lb2/b;

    sget-object v1, Lb2/g$a;->n:Lb2/g$a;

    invoke-direct {v0, v1, p0, p1}, Lb2/b;-><init>(Lb2/g$a;J)V

    return-object v0
.end method

.method public static f()Lb2/g;
    .locals 4

    new-instance v0, Lb2/b;

    sget-object v1, Lb2/g$a;->o:Lb2/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lb2/b;-><init>(Lb2/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lb2/g$a;
.end method
