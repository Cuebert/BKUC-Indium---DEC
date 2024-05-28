.class public final synthetic Ln5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/f;


# static fields
.field public static final synthetic a:Ln5/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/c;

    invoke-direct {v0}, Ln5/c;-><init>()V

    sput-object v0, Ln5/c;->a:Ln5/c;

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

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ll5/g;

    invoke-static {p1, p2}, Ln5/d;->c(Ljava/lang/String;Ll5/g;)V

    return-void
.end method
