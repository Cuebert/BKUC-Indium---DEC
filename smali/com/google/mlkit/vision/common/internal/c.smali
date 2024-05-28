.class public final synthetic Lcom/google/mlkit/vision/common/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# static fields
.field public static final synthetic a:Lcom/google/mlkit/vision/common/internal/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/common/internal/c;

    invoke-direct {v0}, Lcom/google/mlkit/vision/common/internal/c;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/common/internal/c;->a:Lcom/google/mlkit/vision/common/internal/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj5/e;)Ljava/lang/Object;
    .locals 1

    const-class v0, Lcom/google/mlkit/vision/common/internal/a$a;

    .line 1
    invoke-interface {p1, v0}, Lj5/e;->b(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Lcom/google/mlkit/vision/common/internal/a;

    .line 2
    invoke-direct {v0, p1}, Lcom/google/mlkit/vision/common/internal/a;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
