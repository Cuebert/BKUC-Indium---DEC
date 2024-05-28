.class public final Leb/b;
.super Leb/a;
.source "SourceFile"


# instance fields
.field private final p:Leb/b$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Leb/a;-><init>()V

    .line 2
    new-instance v0, Leb/b$a;

    invoke-direct {v0}, Leb/b$a;-><init>()V

    iput-object v0, p0, Leb/b;->p:Leb/b$a;

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Leb/b;->p:Leb/b$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
