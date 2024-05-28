.class public abstract Lw3/ia;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Lw3/ha;
    .locals 1

    new-instance v0, Lw3/fa;

    invoke-direct {v0}, Lw3/fa;-><init>()V

    .line 1
    invoke-virtual {v0, p0}, Lw3/fa;->d(Ljava/lang/String;)Lw3/ha;

    const/4 p0, 0x1

    .line 2
    invoke-virtual {v0, p0}, Lw3/ha;->a(Z)Lw3/ha;

    .line 3
    invoke-virtual {v0, p0}, Lw3/ha;->b(I)Lw3/ha;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
