.class public final Ld2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ld2/f;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld2/d;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ld2/b;

.field private d:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ld2/a$a;->a:Ld2/f;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ld2/a$a;->b:Ljava/util/List;

    .line 4
    iput-object v0, p0, Ld2/a$a;->c:Ld2/b;

    const-string v0, ""

    .line 5
    iput-object v0, p0, Ld2/a$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ld2/d;)Ld2/a$a;
    .locals 1

    iget-object v0, p0, Ld2/a$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Ld2/a;
    .locals 5

    new-instance v0, Ld2/a;

    iget-object v1, p0, Ld2/a$a;->a:Ld2/f;

    iget-object v2, p0, Ld2/a$a;->b:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Ld2/a$a;->c:Ld2/b;

    iget-object v4, p0, Ld2/a$a;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Ld2/a;-><init>(Ld2/f;Ljava/util/List;Ld2/b;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ld2/a$a;
    .locals 0

    iput-object p1, p0, Ld2/a$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ld2/b;)Ld2/a$a;
    .locals 0

    iput-object p1, p0, Ld2/a$a;->c:Ld2/b;

    return-object p0
.end method

.method public e(Ld2/f;)Ld2/a$a;
    .locals 0

    iput-object p1, p0, Ld2/a$a;->a:Ld2/f;

    return-object p0
.end method
