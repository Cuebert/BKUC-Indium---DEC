.class public final Lkb/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lkb/j0;
    .locals 2

    new-instance v0, Lkb/e;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lkb/e;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
