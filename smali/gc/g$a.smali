.class Lgc/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/g;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lgc/u;)Lgc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/c<",
        "Ljava/lang/Object;",
        "Lgc/b<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/reflect/Type;

.field final synthetic b:Ljava/util/concurrent/Executor;

.field final synthetic c:Lgc/g;


# direct methods
.method constructor <init>(Lgc/g;Ljava/lang/reflect/Type;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgc/g$a;->c:Lgc/g;

    iput-object p2, p0, Lgc/g$a;->a:Ljava/lang/reflect/Type;

    iput-object p3, p0, Lgc/g$a;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lgc/g$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Lgc/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lgc/g$a;->c(Lgc/b;)Lgc/b;

    move-result-object p1

    return-object p1
.end method

.method public c(Lgc/b;)Lgc/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "Ljava/lang/Object;",
            ">;)",
            "Lgc/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgc/g$a;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lgc/g$b;

    invoke-direct {v1, v0, p1}, Lgc/g$b;-><init>(Ljava/util/concurrent/Executor;Lgc/b;)V

    move-object p1, v1

    :goto_0
    return-object p1
.end method
