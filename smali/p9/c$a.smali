.class Lp9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp9/c;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lgc/u;)Lgc/c;
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

.field final synthetic b:Lp9/c;


# direct methods
.method constructor <init>(Lp9/c;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p1, p0, Lp9/c$a;->b:Lp9/c;

    iput-object p2, p0, Lp9/c$a;->a:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lp9/c$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Lgc/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lp9/c$a;->c(Lgc/b;)Lgc/b;

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

    new-instance v0, Lp9/b;

    iget-object v1, p0, Lp9/c$a;->b:Lp9/c;

    invoke-static {v1}, Lp9/c;->d(Lp9/c;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lp9/b;-><init>(Ljava/util/concurrent/Executor;Lgc/b;)V

    return-object v0
.end method
