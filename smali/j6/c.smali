.class public final synthetic Lj6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# static fields
.field public static final synthetic a:Lj6/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj6/c;

    invoke-direct {v0}, Lj6/c;-><init>()V

    sput-object v0, Lj6/c;->a:Lj6/c;

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

    new-instance v0, Lj6/d;

    const-class v1, Lg6/i;

    invoke-interface {p1, v1}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/i;

    invoke-direct {v0, p1}, Lj6/d;-><init>(Lg6/i;)V

    return-object v0
.end method
