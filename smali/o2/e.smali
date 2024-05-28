.class final Lo2/e;
.super Lx2/a$a;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx2/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ljava/lang/Object;Lx2/f$a;Lx2/f$b;)Lx2/a$f;
    .locals 7

    .line 1
    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 2
    new-instance p4, Lu2/g;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lu2/g;-><init>(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lx2/f$a;Lx2/f$b;)V

    return-object p4
.end method
