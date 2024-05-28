.class public abstract Lz1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/k$a;,
        Lz1/k$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lz1/k$a;
    .locals 1

    new-instance v0, Lz1/e$b;

    invoke-direct {v0}, Lz1/e$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lz1/a;
.end method

.method public abstract c()Lz1/k$b;
.end method
