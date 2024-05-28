.class public final Lkb/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkb/q0;


# instance fields
.field private final n:Lkb/e1;


# direct methods
.method public constructor <init>(Lkb/e1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkb/p0;->n:Lkb/e1;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()Lkb/e1;
    .locals 1

    iget-object v0, p0, Lkb/p0;->n:Lkb/e1;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
