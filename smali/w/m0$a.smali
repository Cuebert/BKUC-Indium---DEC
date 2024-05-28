.class public final Lw/m0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lw/k0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lw/k0$a;

    invoke-direct {v0}, Lw/k0$a;-><init>()V

    .line 3
    invoke-virtual {v0}, Lw/k0$a;->h()Lw/k0;

    move-result-object v0

    iput-object v0, p0, Lw/m0$a;->a:Lw/k0;

    return-void
.end method


# virtual methods
.method public a()Lw/k0;
    .locals 1

    iget-object v0, p0, Lw/m0$a;->a:Lw/k0;

    return-object v0
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
