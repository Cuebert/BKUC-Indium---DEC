.class public final synthetic Ld6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# static fields
.field public static final synthetic a:Ld6/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ld6/d;

    invoke-direct {v0}, Ld6/d;-><init>()V

    sput-object v0, Ld6/d;->a:Ld6/d;

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

    new-instance v0, Lg6/d;

    const-class v1, Lg6/j;

    invoke-interface {p1, v1}, Lj5/e;->c(Ljava/lang/Class;)Lt5/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lg6/d;-><init>(Lt5/b;)V

    return-object v0
.end method
