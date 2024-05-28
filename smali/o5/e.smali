.class public final synthetic Lo5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# static fields
.field public static final synthetic a:Lo5/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/e;

    invoke-direct {v0}, Lo5/e;-><init>()V

    sput-object v0, Lo5/e;->a:Lo5/e;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, Ll5/e;

    invoke-static {p1, p2}, Lo5/f;->b(Ljava/util/Map$Entry;Ll5/e;)V

    return-void
.end method
