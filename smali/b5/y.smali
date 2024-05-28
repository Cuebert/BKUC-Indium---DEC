.class public final Lb5/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/j;


# instance fields
.field private final a:Ld5/m;


# direct methods
.method public constructor <init>(Ld5/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/y;->a:Ld5/m;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/y;->a:Ld5/m;

    invoke-interface {v0}, Ld5/m;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lb5/x;

    .line 2
    check-cast v0, Lb5/t;

    invoke-direct {v1, v0}, Lb5/x;-><init>(Lb5/t;)V

    return-object v1
.end method
