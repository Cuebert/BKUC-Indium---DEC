.class public interface abstract Ls0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ObsoleteSdkInt"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/k$a;
    }
.end annotation


# static fields
.field public static final a:Ls0/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls0/k$a;->a:Ls0/k$a;

    sput-object v0, Ls0/k;->a:Ls0/k$a;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;Ls0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ls0/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ls0/b;",
            "Landroid/os/CancellationSignal;",
            "Ljava/util/concurrent/Executor;",
            "Ls0/l<",
            "Ls0/c;",
            "Lt0/e;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract b(Landroid/content/Context;Ls0/t;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ls0/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ls0/t;",
            "Landroid/os/CancellationSignal;",
            "Ljava/util/concurrent/Executor;",
            "Ls0/l<",
            "Ls0/u;",
            "Lt0/m;",
            ">;)V"
        }
    .end annotation
.end method
