.class final Lgc/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc/e$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lgc/c<",
        "TR;",
        "Ljava/util/concurrent/CompletableFuture<",
        "Lgc/t<",
        "TR;>;>;>;"
    }
.end annotation

.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/e$c;->a:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lgc/e$c;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Lgc/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lgc/e$c;->c(Lgc/b;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p1

    return-object p1
.end method

.method public c(Lgc/b;)Ljava/util/concurrent/CompletableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "TR;>;)",
            "Ljava/util/concurrent/CompletableFuture<",
            "Lgc/t<",
            "TR;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lgc/e$b;

    invoke-direct {v0, p1}, Lgc/e$b;-><init>(Lgc/b;)V

    .line 2
    new-instance v1, Lgc/e$c$a;

    invoke-direct {v1, p0, v0}, Lgc/e$c$a;-><init>(Lgc/e$c;Ljava/util/concurrent/CompletableFuture;)V

    invoke-interface {p1, v1}, Lgc/b;->W(Lgc/d;)V

    return-object v0
.end method
