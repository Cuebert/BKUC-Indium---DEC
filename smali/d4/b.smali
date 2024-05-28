.class final Ld4/b;
.super Lx2/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/a$a<",
        "Lcom/google/android/gms/signin/internal/a;",
        "Ld4/a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx2/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ljava/lang/Object;Lx2/f$a;Lx2/f$b;)Lx2/a$f;
    .locals 8

    .line 1
    check-cast p4, Ld4/a;

    .line 2
    new-instance p4, Lcom/google/android/gms/signin/internal/a;

    .line 3
    invoke-static {p3}, Lcom/google/android/gms/signin/internal/a;->m0(Lz2/b;)Landroid/os/Bundle;

    move-result-object v5

    const/4 v3, 0x1

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    .line 4
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/signin/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLz2/b;Landroid/os/Bundle;Lx2/f$a;Lx2/f$b;)V

    return-object p4
.end method
