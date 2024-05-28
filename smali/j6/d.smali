.class public final Lj6/d;
.super Lg6/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg6/e<",
        "Li6/c;",
        "Lj6/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Lg6/i;


# direct methods
.method public constructor <init>(Lg6/i;)V
    .locals 0

    invoke-direct {p0}, Lg6/e;-><init>()V

    iput-object p1, p0, Lj6/d;->b:Lg6/i;

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Li6/c;

    iget-object v0, p0, Lj6/d;->b:Lg6/i;

    .line 2
    invoke-virtual {v0}, Lg6/i;->b()Landroid/content/Context;

    move-result-object v0

    .line 3
    invoke-static {}, Lj6/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lw3/ab;->b(Ljava/lang/String;)Lw3/pa;

    move-result-object v1

    .line 4
    invoke-static {v0}, Lj6/k;->c(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 5
    invoke-static {}, Lcom/google/android/gms/common/b;->f()Lcom/google/android/gms/common/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;)I

    move-result v2

    const v3, 0xc306c20

    if-lt v2, v3, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance v2, Lj6/m;

    .line 7
    invoke-direct {v2, v0, p1, v1}, Lj6/m;-><init>(Landroid/content/Context;Li6/c;Lw3/pa;)V

    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    new-instance v2, Lj6/k;

    .line 9
    invoke-direct {v2, v0, p1, v1}, Lj6/k;-><init>(Landroid/content/Context;Li6/c;Lw3/pa;)V

    .line 10
    :goto_1
    new-instance v0, Lj6/g;

    iget-object v3, p0, Lj6/d;->b:Lg6/i;

    invoke-direct {v0, v3, p1, v2, v1}, Lj6/g;-><init>(Lg6/i;Li6/c;Lj6/h;Lw3/pa;)V

    return-object v0
.end method
