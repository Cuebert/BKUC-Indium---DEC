.class public abstract Lz1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/o$a;,
        Lz1/o$b;,
        Lz1/o$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lz1/o$a;
    .locals 1

    new-instance v0, Lz1/i$b;

    invoke-direct {v0}, Lz1/i$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lz1/o$b;
.end method

.method public abstract c()Lz1/o$c;
.end method
