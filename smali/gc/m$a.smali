.class final Lgc/m$a;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"

# interfaces
.implements Ldb/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/m;->a(Lgc/b;Lva/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Ldb/l<",
        "Ljava/lang/Throwable;",
        "Lta/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic n:Lgc/b;


# direct methods
.method constructor <init>(Lgc/b;)V
    .locals 0

    iput-object p1, p0, Lgc/m$a;->n:Lgc/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lgc/m$a;->n:Lgc/b;

    invoke-interface {p1}, Lgc/b;->cancel()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lgc/m$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lta/l;->a:Lta/l;

    return-object p1
.end method
