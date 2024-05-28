.class public final Lhc/a;
.super Lgc/f$a;
.source "SourceFile"


# instance fields
.field private final a:Lb6/f;


# direct methods
.method private constructor <init>(Lb6/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/f$a;-><init>()V

    .line 2
    iput-object p1, p0, Lhc/a;->a:Lb6/f;

    return-void
.end method

.method public static f()Lhc/a;
    .locals 1

    new-instance v0, Lb6/f;

    invoke-direct {v0}, Lb6/f;-><init>()V

    invoke-static {v0}, Lhc/a;->g(Lb6/f;)Lhc/a;

    move-result-object v0

    return-object v0
.end method

.method public static g(Lb6/f;)Lhc/a;
    .locals 1

    const-string v0, "gson == null"

    .line 1
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lhc/a;

    invoke-direct {v0, p0}, Lhc/a;-><init>(Lb6/f;)V

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lgc/u;)Lgc/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lgc/u;",
            ")",
            "Lgc/f<",
            "*",
            "Lob/h0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lhc/a;->a:Lb6/f;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Lb6/f;->l(Lcom/google/gson/reflect/TypeToken;)Lb6/v;

    move-result-object p1

    .line 2
    new-instance p2, Lhc/b;

    iget-object p3, p0, Lhc/a;->a:Lb6/f;

    invoke-direct {p2, p3, p1}, Lhc/b;-><init>(Lb6/f;Lb6/v;)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lgc/u;)Lgc/f;
    .locals 0
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
    iget-object p2, p0, Lhc/a;->a:Lb6/f;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Lb6/f;->l(Lcom/google/gson/reflect/TypeToken;)Lb6/v;

    move-result-object p1

    .line 2
    new-instance p2, Lhc/c;

    iget-object p3, p0, Lhc/a;->a:Lb6/f;

    invoke-direct {p2, p3, p1}, Lhc/c;-><init>(Lb6/f;Lb6/v;)V

    return-object p2
.end method
