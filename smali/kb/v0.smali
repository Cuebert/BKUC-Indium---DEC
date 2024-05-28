.class public interface abstract Lkb/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/v0$a;,
        Lkb/v0$b;
    }
.end annotation


# static fields
.field public static final k:Lkb/v0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkb/v0$b;->n:Lkb/v0$b;

    sput-object v0, Lkb/v0;->k:Lkb/v0$b;

    return-void
.end method


# virtual methods
.method public abstract T()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract X(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract c()Z
.end method

.method public abstract l(ZZLdb/l;)Lkb/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;)",
            "Lkb/h0;"
        }
    .end annotation
.end method
