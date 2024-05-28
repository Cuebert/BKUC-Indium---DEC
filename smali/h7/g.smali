.class public Lh7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lh7/f;


# direct methods
.method public static a()Lh7/f;
    .locals 1

    .line 1
    sget-object v0, Lh7/g;->a:Lh7/f;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lh7/h;

    invoke-direct {v0}, Lh7/h;-><init>()V

    :goto_0
    return-object v0
.end method
