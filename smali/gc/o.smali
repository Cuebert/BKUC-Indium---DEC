.class final Lgc/o;
.super Lgc/f$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc/o$a;
    }
.end annotation

.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# static fields
.field static final a:Lgc/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgc/o;

    invoke-direct {v0}, Lgc/o;-><init>()V

    sput-object v0, Lgc/o;->a:Lgc/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgc/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lgc/u;)Lgc/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lgc/u;",
            ")",
            "Lgc/f<",
            "Lob/j0;",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lgc/f$a;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/util/Optional;

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 2
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0, p1}, Lgc/f$a;->a(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    .line 3
    invoke-virtual {p3, p1, p2}, Lgc/u;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lgc/f;

    move-result-object p1

    .line 4
    new-instance p2, Lgc/o$a;

    invoke-direct {p2, p1}, Lgc/o$a;-><init>(Lgc/f;)V

    return-object p2
.end method
