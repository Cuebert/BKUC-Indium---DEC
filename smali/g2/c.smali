.class public Lg2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/e;


# static fields
.field private static final f:Ljava/util/logging/Logger;


# instance fields
.field private final a:Lh2/x;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lb2/e;

.field private final d:Li2/d;

.field private final e:Lj2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, La2/t;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg2/c;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lb2/e;Lh2/x;Li2/d;Lj2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg2/c;->b:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Lg2/c;->c:Lb2/e;

    .line 4
    iput-object p3, p0, Lg2/c;->a:Lh2/x;

    .line 5
    iput-object p4, p0, Lg2/c;->d:Li2/d;

    .line 6
    iput-object p5, p0, Lg2/c;->e:Lj2/b;

    return-void
.end method

.method public static synthetic b(Lg2/c;La2/o;Ly1/h;La2/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg2/c;->e(La2/o;Ly1/h;La2/i;)V

    return-void
.end method

.method public static synthetic c(Lg2/c;La2/o;La2/i;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lg2/c;->d(La2/o;La2/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(La2/o;La2/i;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lg2/c;->d:Li2/d;

    invoke-interface {v0, p1, p2}, Li2/d;->H(La2/o;La2/i;)Li2/k;

    .line 2
    iget-object p2, p0, Lg2/c;->a:Lh2/x;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lh2/x;->a(La2/o;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic e(La2/o;Ly1/h;La2/i;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lg2/c;->c:Lb2/e;

    .line 2
    invoke-virtual {p1}, La2/o;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lb2/e;->a(Ljava/lang/String;)Lb2/m;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p3, "Transport backend \'%s\' is not registered"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1}, La2/o;->b()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    .line 4
    invoke-static {p3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 5
    sget-object p3, Lg2/c;->f:Ljava/util/logging/Logger;

    invoke-virtual {p3, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 6
    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ly1/h;->a(Ljava/lang/Exception;)V

    return-void

    .line 7
    :cond_0
    invoke-interface {v0, p3}, Lb2/m;->a(La2/i;)La2/i;

    move-result-object p3

    .line 8
    iget-object v0, p0, Lg2/c;->e:Lj2/b;

    new-instance v1, Lg2/a;

    invoke-direct {v1, p0, p1, p3}, Lg2/a;-><init>(Lg2/c;La2/o;La2/i;)V

    invoke-interface {v0, v1}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 9
    invoke-interface {p2, p1}, Ly1/h;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    sget-object p3, Lg2/c;->f:Ljava/util/logging/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error scheduling event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 11
    invoke-interface {p2, p1}, Ly1/h;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(La2/o;La2/i;Ly1/h;)V
    .locals 2

    iget-object v0, p0, Lg2/c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lg2/b;

    invoke-direct {v1, p0, p1, p3, p2}, Lg2/b;-><init>(Lg2/c;La2/o;Ly1/h;La2/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
