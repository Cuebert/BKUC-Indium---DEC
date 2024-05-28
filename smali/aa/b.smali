.class public final synthetic Laa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/a;


# static fields
.field public static final synthetic a:Laa/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/b;

    invoke-direct {v0}, Laa/b;-><init>()V

    sput-object v0, Laa/b;->a:Laa/b;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;
    .locals 0

    invoke-static {p1}, Laa/c;->b(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;

    move-result-object p1

    return-object p1
.end method
