.class public final Lb5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/j;


# instance fields
.field private final a:Ld5/m;

.field private final b:Ld5/m;


# direct methods
.method public constructor <init>(Ld5/m;Ld5/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/v;->a:Ld5/m;

    iput-object p2, p0, Lb5/v;->b:Ld5/m;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/v;->a:Ld5/m;

    invoke-interface {v0}, Ld5/m;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lb5/v;->b:Ld5/m;

    invoke-interface {v1}, Ld5/m;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld5/x;

    new-instance v2, Lb5/t;

    check-cast v0, Landroid/content/Context;

    .line 2
    invoke-direct {v2, v0, v1}, Lb5/t;-><init>(Landroid/content/Context;Ld5/x;)V

    return-object v2
.end method
