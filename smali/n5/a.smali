.class public final synthetic Ln5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# static fields
.field public static final synthetic a:Ln5/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/a;

    invoke-direct {v0}, Ln5/a;-><init>()V

    sput-object v0, Ln5/a;->a:Ln5/a;

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

    check-cast p2, Ll5/e;

    invoke-static {p1, p2}, Ln5/d;->b(Ljava/lang/Object;Ll5/e;)V

    return-void
.end method
