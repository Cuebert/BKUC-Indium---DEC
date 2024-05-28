.class public Lp9/c;
.super Lgc/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp9/c$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/Executor;


# direct methods
.method private constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c$a;-><init>()V

    .line 2
    iput-object p1, p0, Lp9/c;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic d(Lp9/c;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lp9/c;->a:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static e()Lp9/c;
    .locals 3

    new-instance v0, Lp9/c;

    new-instance v1, Lp9/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lp9/c$b;-><init>(Lp9/c$a;)V

    invoke-direct {v0, v1}, Lp9/c;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lgc/u;)Lgc/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lgc/u;",
            ")",
            "Lgc/c<",
            "**>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lgc/c$a;->c(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Lgc/b;

    if-eq p2, p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 p2, 0x0

    .line 2
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {p2, p1}, Lgc/c$a;->b(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    .line 3
    new-instance p2, Lp9/c$a;

    invoke-direct {p2, p0, p1}, Lp9/c$a;-><init>(Lp9/c;Ljava/lang/reflect/Type;)V

    return-object p2
.end method
