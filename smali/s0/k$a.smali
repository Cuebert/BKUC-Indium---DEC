.class public final Ls0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ls0/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls0/k$a;

    invoke-direct {v0}, Ls0/k$a;-><init>()V

    sput-object v0, Ls0/k$a;->a:Ls0/k$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ls0/k;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls0/m;

    invoke-direct {v0, p1}, Ls0/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
