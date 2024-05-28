.class public final synthetic Lq3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/k;


# instance fields
.field public final synthetic a:Lq3/b;


# direct methods
.method public synthetic constructor <init>(Lq3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/j;->a:Lq3/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lq3/j;->a:Lq3/b;

    check-cast p1, Lq3/i;

    check-cast p2, Lg4/m;

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lq3/f;

    new-instance v1, Lq3/k;

    invoke-direct {v1, v0, p2}, Lq3/k;-><init>(Lq3/b;Lg4/m;)V

    .line 2
    invoke-virtual {p1, v1}, Lq3/f;->n(Lq3/h;)V

    return-void
.end method
