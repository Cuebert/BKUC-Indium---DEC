.class public final synthetic Li2/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m0$b;


# static fields
.field public static final synthetic a:Li2/b0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/b0;

    invoke-direct {v0}, Li2/b0;-><init>()V

    sput-object v0, Li2/b0;->a:Li2/b0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Li2/m0;->z(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
