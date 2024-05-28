.class public final synthetic Ld6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# static fields
.field public static final synthetic a:Ld6/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ld6/h;

    invoke-direct {v0}, Ld6/h;-><init>()V

    sput-object v0, Ld6/h;->a:Ld6/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj5/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lf6/c$a;

    const-class v1, Lf6/a;

    const-class v2, Le6/a;

    invoke-interface {p1, v2}, Lj5/e;->c(Ljava/lang/Class;)Lt5/b;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lf6/c$a;-><init>(Ljava/lang/Class;Lt5/b;)V

    return-object v0
.end method
