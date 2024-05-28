.class public final synthetic Lg6/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# static fields
.field public static final synthetic a:Lg6/b0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lg6/b0;

    invoke-direct {v0}, Lg6/b0;-><init>()V

    sput-object v0, Lg6/b0;->a:Lg6/b0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj5/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lg6/n;

    const-class v1, Landroid/content/Context;

    invoke-interface {p1, v1}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1}, Lg6/n;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
