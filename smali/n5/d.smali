.class public final Ln5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm5/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm5/b<",
        "Ln5/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final e:Ll5/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll5/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ll5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll5/f<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Ll5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll5/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Ln5/d$b;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ll5/d<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ll5/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private c:Ll5/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll5/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ln5/a;->a:Ln5/a;

    sput-object v0, Ln5/d;->e:Ll5/d;

    .line 2
    sget-object v0, Ln5/c;->a:Ln5/c;

    sput-object v0, Ln5/d;->f:Ll5/f;

    .line 3
    sget-object v0, Ln5/b;->a:Ln5/b;

    sput-object v0, Ln5/d;->g:Ll5/f;

    .line 4
    new-instance v0, Ln5/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln5/d$b;-><init>(Ln5/d$a;)V

    sput-object v0, Ln5/d;->h:Ln5/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ln5/d;->a:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ln5/d;->b:Ljava/util/Map;

    .line 4
    sget-object v0, Ln5/d;->e:Ll5/d;

    iput-object v0, p0, Ln5/d;->c:Ll5/d;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ln5/d;->d:Z

    .line 6
    const-class v0, Ljava/lang/String;

    sget-object v1, Ln5/d;->f:Ll5/f;

    invoke-virtual {p0, v0, v1}, Ln5/d;->p(Ljava/lang/Class;Ll5/f;)Ln5/d;

    .line 7
    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Ln5/d;->g:Ll5/f;

    invoke-virtual {p0, v0, v1}, Ln5/d;->p(Ljava/lang/Class;Ll5/f;)Ln5/d;

    .line 8
    const-class v0, Ljava/util/Date;

    sget-object v1, Ln5/d;->h:Ln5/d$b;

    invoke-virtual {p0, v0, v1}, Ln5/d;->p(Ljava/lang/Class;Ll5/f;)Ln5/d;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Ll5/e;)V
    .locals 0

    invoke-static {p0, p1}, Ln5/d;->l(Ljava/lang/Object;Ll5/e;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Ll5/g;)V
    .locals 0

    invoke-static {p0, p1}, Ln5/d;->m(Ljava/lang/String;Ll5/g;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Boolean;Ll5/g;)V
    .locals 0

    invoke-static {p0, p1}, Ln5/d;->n(Ljava/lang/Boolean;Ll5/g;)V

    return-void
.end method

.method static synthetic e(Ln5/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ln5/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic f(Ln5/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ln5/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic g(Ln5/d;)Ll5/d;
    .locals 0

    iget-object p0, p0, Ln5/d;->c:Ll5/d;

    return-object p0
.end method

.method static synthetic h(Ln5/d;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/d;->d:Z

    return p0
.end method

.method private static synthetic l(Ljava/lang/Object;Ll5/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance p1, Ll5/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ll5/b;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static synthetic m(Ljava/lang/String;Ll5/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1, p0}, Ll5/g;->b(Ljava/lang/String;)Ll5/g;

    return-void
.end method

.method private static synthetic n(Ljava/lang/Boolean;Ll5/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Ll5/g;->c(Z)Ll5/g;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Ll5/d;)Lm5/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ln5/d;->o(Ljava/lang/Class;Ll5/d;)Ln5/d;

    move-result-object p1

    return-object p1
.end method

.method public i()Ll5/a;
    .locals 1

    new-instance v0, Ln5/d$a;

    invoke-direct {v0, p0}, Ln5/d$a;-><init>(Ln5/d;)V

    return-object v0
.end method

.method public j(Lm5/a;)Ln5/d;
    .locals 0

    invoke-interface {p1, p0}, Lm5/a;->a(Lm5/b;)V

    return-object p0
.end method

.method public k(Z)Ln5/d;
    .locals 0

    iput-boolean p1, p0, Ln5/d;->d:Z

    return-object p0
.end method

.method public o(Ljava/lang/Class;Ll5/d;)Ln5/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ll5/d<",
            "-TT;>;)",
            "Ln5/d;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ln5/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object p2, p0, Ln5/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Ljava/lang/Class;Ll5/f;)Ln5/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ll5/f<",
            "-TT;>;)",
            "Ln5/d;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ln5/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object p2, p0, Ln5/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
